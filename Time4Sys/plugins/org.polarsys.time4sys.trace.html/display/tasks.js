;

(function tasks() {
    "use strict";
    
    function prettyFormatTime(timeInPicoseconds) {
	var t = timeInPicoseconds;
	if (t == 0) {
            return '0';
	}
	var units = ['ps', 'ns', 'µs', 'ms', 's'];
	var index;
	for (index = 0; index < units.length; ++index) {
            var u = units[index];
            if (t % 1000 != 0) {
		return String(t) + u;
            }
            t = t / 1000;
	}
	return '?';
    }
    
    var margin = {top: 20, right: 20, bottom: 60, left: 50},
	width = 960 - margin.left - margin.right,
	height = 500 - margin.top - margin.bottom;
    
    var x = d3.scale.linear().range([0, width]);
    
    var xAxis = d3.svg.axis()
	.scale(x)
	.orient("bottom")
	.ticks(5)
	.tickFormat(function(d,i) {return prettyFormatTime(d);});
    
    function type(d) {
	d.start = Number(d.start);
	d.end = Number(d.end);
	d.duration = d.end - d.start;
	return d;
    }    
    
    window.updateSVG = function updateSVG(dataId, tasksList) {

	var dataElt = document.getElementById(dataId);
	var strData = dataElt.value;
	
	var y = d3.scale.ordinal()
            .domain(tasksList)
            .rangeRoundBands([0, height], .1);
	
	var yAxis = d3.svg.axis()
            .scale(y)
            .orient("left");
	
	var tasks = d3.select("#tasks");
	tasks.selectAll("*").remove();
	
	var svg = tasks.append("svg")
            .attr("width", width + margin.left + margin.right)
            .attr("height", height + margin.top + margin.bottom)
            .append("g")
            .attr("transform", "translate(" + margin.left + "," + margin.top + ")");
	
	var data = d3.tsv.parse(strData, type);
	x.domain([0, d3.max(data, function(d) { return d.end; })]);
        y.domain(data.map(function(d) { return d.name; }));
        
        var tmp = svg.append('g')
            .attr('class', 'x axis')
            .attr('transform', 'translate(0,' + height + ')')
            .call(xAxis);
        
        tmp.selectAll("text")
            .style("text-anchor", "end")
            .attr("transform", function() { return "rotate(-30)"});
        
        tmp.append("text")
            .attr("x", '100%')
            .attr("dx", "-5em")
            .attr("dy", "-1em")
            .style("text-anchor", "end")
            .text('time (ps)');
        
        tmp = svg.append("g")
            .attr("class", "y axis")
            .call(yAxis);
        
        tmp.selectAll("text")
            .style("text-anchor", "end")
            .attr("transform", function() { return "rotate(-60)"});
        
        tmp.append("text")
            .attr("transform", "rotate(-90)")
            .attr("y", 6)
            .attr("dy", "-2em")
            .attr("dx", "2em")
            .style("text-anchor", "end")
            .text("Tasks");
        
        svg.selectAll(".bar")
            .data(data)
            .enter()
            .append("rect")
            .attr("class", function(d) { return "bar " +  d.state})
            .attr("x", function(d) { return x(d.start); })
            .attr("width", function(d) {
            	 var duration = Math.max(5, x(d.duration));
            	 return duration;
            	 })
            .attr("y",   function(d) { return y(d.name); })
            .attr("height", y.rangeBand())
            .attr('rx', 5)
            .attr('ry', 5)
            .append('svg:title')
            .text(function(d) { return d.name + '.' + d.state + ' [' + prettyFormatTime(d.start) + ' - ' + prettyFormatTime(d.end) + ']'; });

	dataElt.setAttribute('style', 'display: none');
    }
    
})();
