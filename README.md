Source: https://github.com/malvee/Booking.com

## Problem 1 (Array sum)
Identify whether there exists a pair of numbers in an array such that
their sum is equal to **N**.

Input:
The first line contains one integer *N*, which is the sum we are trying to find.
The second line contains one integer *M*, which is the length of the array.
This is followed by M lines each containing one element of the array.

Output:
Output 1 if there exists a pair of numbers in the array such that their
sum equals N. If such a pair does not exist, output 0.

Sample Input:
```
66
10
18
11
21
28
31
38
40
55
60
62
```
Sample Output:
```
1
```

---

## Problem 2 (Anagram):
An anagram is a word that can be written as a permutation of the characters
of another word, like "dirty room" and "dormitory" (ignore spaces). However,
"the" and "thee" are not anagrams, since "the" only has a single "e" whereas
"thee" has two "e" characters (spaces can occur zero, or multiple times, however.)

Given a list of words as strings, you should return another list of strings,
each containing words that are mutual anagrams.

Each string of the output should be a single group of anagarms joined with commas.

Within an output string, the expression should be sorted lexicographically.
If a group contains only a single element, output that one-element group
as a single string. And the string should be also output in lexicographical
order.  Given e.g.:
```
pear
amleth
dormitory
tinsel
dirty room
hamlet
listen
silnet
```
... the output would be:
```
amleth,hamlet
dirty room,dormitory
listen,silnet,tinsel
pear
```