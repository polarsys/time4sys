initially {
int P1=1, P2=0, P3=0, P4=0, P5=0, P6=1, P7=0, P8=0, P9=0, P10=0, P19=0, P20=0, P21=0, P22=0, P23=1, P24=1, P25=0, P26=0, P27=0, P28=0, P29=0, P30=0, P31=0, P32=0;}

transition [ intermediate { P1 = P1 - 1; }]T1 [0,0]
	when (P1 >= 1)
	{ P1 = P1- 1, P2 = P2 + 1;}

transition [ intermediate { P2 = P2 - 1; }]T2 [0,0]
	when (P2 >= 1)
	{ P2 = P2- 1, P3 = P3 + 1, P4 = P4 + 1;}

transition [ intermediate { P3 = P3 - 1; }]T3 [70,70]
	when (P3 >= 1)
	{ P3 = P3- 1 + 1, P4 = P4 + 1;}

transition [ intermediate { P4 = P4 - 1; }]T4 [0,0]
	when (P4 >= 1)
	{ P4 = P4- 1, P5 = P5 + 1;}

transition [ intermediate { P5 = P5 - 1; }]T5 [26,26]
	when (P5 >= 1)
	{ P5 = P5 - 1;}

transition [ intermediate { P6 = P6 - 1; }]T6 [0,0]
	when (P6 >= 1)
	{ P6 = P6- 1, P7 = P7 + 1;}

transition [ intermediate { P7 = P7 - 1; }]T7 [0,0]
	when (P7 >= 1)
	{ P7 = P7- 1, P8 = P8 + 1, P9 = P9 + 1;}

transition [ intermediate { P8 = P8 - 1; }]T8 [100,100]
	when (P8 >= 1)
	{ P8 = P8- 1 + 1, P9 = P9 + 1;}

transition [ intermediate { P9 = P9 - 1; }]T9 [0,0]
	when (P9 >= 1)
	{ P9 = P9- 1, P10 = P10 + 1, P19 = P19 + 1;}

transition [intermediate { P10 = P10 - 1; },speed=min(1,max(0,1-P5)) ]T10 [62,62]
	when (P10 >= 1)
	{ P10 = P10- 1, P20 = P20 + 1, P5 = P5;}

transition [intermediate { P22 = 0, P19 = P19 - 1, P23 = P23 - 1;} ]T17 [0,0]
	when (P19 >= 1 and P23 >= 1)
	{ P19 = P19- 1, P23 = P23 - 1, P22 = 0, P21 = P21 + 1, P29 = P29 + 1;}

transition [intermediate { P20 = P20 - 1, P24 = P24 - 1; }]T18 [0,0]
	when (P20 >= 1 and P24 >= 1)
	{ P20 = P20- 1, P24 = P24 - 1, P22 = P22 + 1, P30 = P30 + 1;}

transition [ intermediate { P21 = P21 - 1; }]T19 [wt,wt]
	when (P21 >= 1)
	{ P21 = P21- 1, P25 = P25 + 1;}

transition [intermediate { P21 = P21 - 1, P22 = P22 - 1; }]T20 [0,0]
	when (P21 >= 1 and P22 >= 1)
	{ P21 = P21- 1, P22 = P22 - 1, P26 = P26 + 1;}

transition [ intermediate { P25 = P25 - 1; }]T21 [0,0]
	when (P25 >= 1)
	{ P25 = P25 - 1;}

transition [ intermediate { P26 = P26 - 1; }]T22 [0,0]
	when (P26 >= 1)
	{ P26 = P26 - 1;}

transition [intermediate { P28 = 0, P19 = P19 - 1, P29 = P29 - 1;} ]T23 [0,0]
	when (P19 >= 1 and P29 >= 1)
	{ P19 = P19- 1, P29 = P29 - 1, P28 = 0, P23 = P23 + 1, P27 = P27 + 1;}

transition [intermediate { P20 = P20 - 1, P30 = P30 - 1; }]T24 [0,0]
	when (P20 >= 1 and P30 >= 1)
	{ P20 = P20- 1, P30 = P30 - 1, P24 = P24 + 1, P28 = P28 + 1;}

transition [ intermediate { P27 = P27 - 1; }]T25 [wt,wt]
	when (P27 >= 1)
	{ P27 = P27- 1, P31 = P31 + 1;}

transition [intermediate { P27 = P27 - 1, P28 = P28 - 1; }]T26 [0,0]
	when (P27 >= 1 and P28 >= 1)
	{ P27 = P27- 1, P28 = P28 - 1, P32 = P32 + 1;}

transition [ intermediate { P31 = P31 - 1; }]T27 [0,0]
	when (P31 >= 1)
	{ P31 = P31 - 1;}

transition [ intermediate { P32 = P32 - 1; }]T28 [0,0]
	when (P32 >= 1)
	{ P32 = P32 - 1;}


check AG[0,inf]P25<1 and P31<1