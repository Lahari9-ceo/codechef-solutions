# Richie Rich

## Problem Statement
Richie Rich wants to become the richest person in his town. Currently, his wealth is `A` units. He wants to increase it by `B` units. The richest person in town has `X` units of wealth. Determine whether Richie Rich will become richer than the richest person after increasing his wealth.

## Input Format
- The first line contains three integers `A`, `B`, and `X`.

## Output Format
- Print `"YES"` if Richie Rich becomes richer than the richest person.
- Otherwise, print `"NO"`.

## Constraints
- 1 ≤ A, B, X ≤ 10^9

## Sample Input/Output

### Sample 1
Input:
3
100 200 10
111 199 11
190 200 10
output:
10
8
1
Explaination:
Test Case 1: 
		Chef needs to increase his worth by 200−100=100 billion dollars and his increment per year being 10 billion dollars, so it will take him  100/10​ =10 years to do so.

Test Case 2: 
		Chef needs to increase his worth by 199−111=88 billion dollars and his increment per year being 10 billion dollars, so it will take him  88/11 = 8 years to do so.

Test Case 3:
		Chef needs to increase his worth by 200−190=10 billion dollars and his increment per year being 10 billion dollars, so it will take him  10/10​ =1 year to do so.
