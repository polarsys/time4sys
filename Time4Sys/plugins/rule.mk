%.html: %.adoc
	asciidoctor -a mathjax -o $@ $< && dos2unix $@

%.slide.html: %.slide.adoc
	asciidoc --backend slidy --attribute stylesheet=$(PWD)/talks/slidy-designcps.css -o $@ $<

%.pdf: %.adoc
	a2x -vvvv -a latexmath -a docinfo -f pdf -r . --dblatex-opts "--param=latex.encoding=utf8 -P doc.publisher.show=0 -P ulink.show=1 -P ulink.footnotes=1 --param=latex.class.options=11pt --param toc.section.depth=1"  --xsltproc-opts "--stringparam ulink.show 1 --stringparam ulink.footnotes 1 --stringparam toc.section.depth 1" $<
