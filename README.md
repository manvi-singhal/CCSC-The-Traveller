# The Traveller

## Problem Statement
Chef loves to travel and this new year he wants to travel the world. He makes new year
resolutions to travel in some countries. But, the chef has a limited amount of money with
which he has to manage his travelling and residential expenses. He has asked you to help
him check whether he will be able to fulfil his resolutions this year or not.

## Input
First line of input contains a single integer T denoting the number of test cases.
For each test case,
The first line contains n and sum denoting the number of countries he wants to visit this year
and the amount he has.
The next line is an array A where Ai denotes travel expenses for a country i.

## Constraints
- 1 ≤ T ≤ 100
- 1 ≤ n ≤ 1000, 0 ≤ sum ≤ $10^7$
- 0 ≤ A<sub>i</sub> ≤ $10^7$

## Output
Print YES if his new year resolution is feasible else print NO.

## Sample Input
````
2
4 59
13 5 29 10
5 105
45 39 64 17 4
````
## Sample Output
````
YES
NO
````

## ADDITIONAL TESTCASES

### Testcase 1
#### Input
````
2
1 35
17
2 90
76 12
````
#### Output
````
YES
YES
````
### Testcase 2
#### Input
````
3
4 46
2 35 6 53
7 29
5 60 1 37 6 27 14
3 51
32 2 7
````
#### Output
````
NO
NO
YES
````
### Testcase 3
#### Input
````
1
5 26
7 62 8 47 4
3 109
43 4 32
````
#### Output
````
NO
YES
````
