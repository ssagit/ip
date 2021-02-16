# User Guide

## Command Format
1) Words in UPPER_CASE are parameters to be supplied by the user <br>
2) Items in <> brackets are compulsory, not adding them results in exceptions. <br>
3) Parameters must be in order <br>
**e.g.** If `event <TASK_NAME> [/at DATE_FORMAT]` is specified, user must input command in that order. <br>
4) Date format must specifically be `D/MM/YYYY HHMM` <br>
**e.g.** If month is 15th of July 2020 2PM, the format must be `15/07/2020 1400` <br>
5) Extraneous parameters for command that do not take in parameters (such as `list`) will be ignored. <br>
**e.g.** If user specifies `list 123`, helper interprets it as `list`. <br>

## Add TODO task *todo*
Add a TODO task to the task list. <br>
Format: `todo <TASK_NAME>`

## Add EVENT task *event*
Add an event task to the task list. <br>
Format: `event <TASK_NAME> </at DATE_TIME>`

## Add DEADLINE task *deadline*
Add a deadline task to the task list. <br>
Format: `deadline <TASK_NAME> </by DATE_TIME>`

## List tasks *list*
Shows a list of all tasks in the task list. <br>
Format: `list` <br>

## Delete task *delete*
Deletes the specified task from the task list. <br>
Format: `delete <TASK_NUMBER>` <br>
**Tip**: User can find the task number through the command `list`. <br>
Example: <br>
- `delete 1` deletes the first task in the list `todo 2` <br>
![delete_demo](https://github.com/ssagit/ip/blob/master/src/main/resources/images/front_UI.png?raw=true)

## Mark task as complete *done*
Marks a task as complete. <br>
Format: `done <TASK_NUMBER>` <br>
**Tip**: User can find the task number through the command `list`.

## Find a task *find*
Finds a task based on its name. <br>
Format `find <STRING_TO_FIND>`
