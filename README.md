**Special Note:**
This repo is to be used as practice getting use to a GitHub workflow. To begin working on this repo and trying to find your comfort in a GitHub workflow you should `fork` the repository. 

This is found in the top right of the screen

![Fork location](images/fork-button.png)

Selecting this button will give you options asking where you would like to fork the repo.  You can select from your account or any organization you have permission in.  This is different than how a classroom assignment gets distributed.  Make sure to keep that in mind when going through this initial process.

This assignment outlined below is an example of what is given to students (it is not a perfect 1:1 to what students are given).

**Differences from basic**
This version of the assignment uses Maven to create folder structure for the project.  It also includes unit tests that can be used as part of GitHub classroom autograding. When setting up autograding on GitHub Classroom you should have the setup command as `mvn compile` and the run command as `mvn test`.  This will run all the test methods.  There are ways to single out certain methods to run.  That will be covered in a video and updated here once completed.

# Counting Fierce
>Backstory of assignment here for lore purposes.

## Objectives required to complete
This quest has us working with methods and arrays.  We have a goal to determine various pieces of information about three `int` filled arrays.

### Objective 1 - Creating a project board
Description on how to make a project board, template to select.

### Objective 2 - Designing a Plan 
Description of what is expected in a design plan

### Objective 3 - Cloning
Simple reminder to clone this repo into `IntelliJ` here.

### Objective 4 - Branching from the master
Description of how to branch from the `master` in `IntelliJ`.  Expectation is students have more than one branch when working on projects.  They merge branches into master at the end when submitting only the master branch is graded.

**Note** For this practice I would suggest the following branching as it allows for decent practice. A `dev` branch off of the master.  Then each method gets its own branch off of the `dev`.  As these methods are completed they should be merged to the `dev` for testing.  If the methods test well then merge into the `master`.  You could add a `testing` branch between the method branches and the `dev` depends on how much practice you want to give.  While there are some "standards" to branching each company will have different requirements and ways to do it so practicing and find a flow that works best for you and your students is suggested.

## Quest Requirements
**All methods should be static and method names should be as stated in order to avoid errors on unit tests. A note similar to this would be shared with students.**

To get autograding 
- Make an assignment on GitHub Classroom and use your repo as the starter code. 
- On the last page when selecting autograding select the `Run Java` option
- Give test a name
- Setup command type `mvn compile`
- Run command replace what is in there with `mvn test`
- Recommend lowering the timeout to 1-3 minutes
- Points Optional

### Objective 1 - The methods
There are several various pieces of information we can pull from an array of numbers.  Doing these methods help us with method writing, array traversal, variable scope, and method calling.

- Sum the elements `sumElems`

- Average the elements `avgElem`

- Count occurrences `countOccurs`
	- count the number of occurrences in the array of a passed value
	- the array should be the first param

- Determine presence or absence of a value `appearsIn`
	- use the `countOccurs` to help
	- result should be `true` or `false`
	- the array should be the first param

- Determine first location `firstAppear`
	- find the first index of a passed value
    - the array should be the first param
    - return -1 if not found

- Find the minimum number `minValue`

- Find the maximum number `maxValue`

- Find the range `rangeValue`
	- use `minValue` and `maxValue` to help
	
### Objective 2 - Finishing the main
- Call all the methods on each array in the main
- Display the various results to the user in a friendly format

**Bonus**
Find the standard deviation of an array of the following: 600, 470, 170, 430, 300, 280, 389

- Calculated standard deviation rounded to the nearest whole number
- Only outside method you are allowed to call is `Math.sqrt()`
	- no other outside Java methods or methods a "friend" has helped you with

Formula for standard deviation for our purposes is `the square root of the variance`.  The variance is defined as `the average of the squared differences from the mean`.

### Objective 2 - Pushing
Reminder to push code from `IntelliJ` back to GitHub.  Another reminder to merge back into master before making the final push.


#### Grading
|   Points     |   Requirement    |
| :----------: |:---------------- |
| 2            | ZZZ              |
| 2            | YYY              |
| 2            | Bonus correct    |
