# CPD-3314 Assignment No.7

This repo contains starting files and automated unit tests for a selection of exercises based on Chapter 7 of the [textbook for this course](http://www.pearsonhighered.com/educator/product/Starting-Out-with-Java-From-Control-Structures-through-Objects-5E/9780132855839.page).

## Arrays and the ArrayList Class

To retrieve these files and work with them:

1. Open NetBeans
2. Navigate to Team -> Git -> Clone... or Team -> Git -> Remote -> Clone...
3. Enter the Repository URL: https://github.com/ProfRussell/CPD3314-Assign7.git
4. Ensure the *Clone Into:* folder is on the F: Drive
5. Hit Finish, Work from There

## When Complete

Zip your folder up and submit it to the dropbox on [D2L](https://d2l.lambtoncollege.ca)

## Hint for Exercise #5

The "questionsMissed()" method of Exercise #5 is deceptively complex. The expected result is an array of all incorrect question numbers, and only the incorrect ones. It's possible to solve this problem using ArrayLists and converting back to an Integer array, but the easiest solution is to build an array that is the size of totalIncorrect(). eg- `new int[totalIncorrect()]`
