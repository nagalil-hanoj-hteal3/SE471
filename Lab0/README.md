# Lab 0 -- Lab Exercise: Java Programming Warm up
**Lab Objectives**

In this lab, you will learn/recall basic Java programming and understand how the GUI event dispatch thread works. Only two students are allowed to work together in this lab. Try to practice pair programming if possible.
Problem Description

a.	The example code given in this lab can produce the outcome as shown in the figure below.
 <p align="center">
  <img width="460" height="460" src="https://user-images.githubusercontent.com/96222174/221332992-fd4a69ac-4133-4ef1-9f50-9db72cb007c9.png">
</p>
b.	Study the code, make sure you understand how a JPanel object is used, on which lines are drawn. Each edge is divided into an equal number of increments (say, 15). The first line starts in the top-left corner and ends one step right on the bottom edge. For each successive line, move down one increment on the left edge and right one increment on the bottom edge. Continue drawing lines until you reach the bottom-right corner. The figure should scale as you resize the window so that the endpoints always touch the edges. 


c.	Modify the code to mirror the design in all four corners, as shown in the figure below. [60 points]
<p align="center">
  <img width="460" height="460" src="https://user-images.githubusercontent.com/96222174/221333004-e3ff9e8a-abaf-4caf-8ce0-06eba73e0129.png">
</p> 
d.	Add random colors to the lines [20 points]
e.	Use a Runnable  thread (you should take time to learn how to use the Runnable interface to create threads) to animate the drawing of lines, and add a button so that it can be pressed at any time to stop and resume the drawing (the text of the button should be able to change to reflect the current situation: say, from “draw” to “stop” to “resume”). [20 points]
<p align="center">
  <img width="300" height="300" src="https://user-images.githubusercontent.com/96222174/221333180-6d1f9a91-ae26-4fbc-85a3-5804ce75cf78.png">
  <img width = "300" height ="300" src="https://user-images.githubusercontent.com/96222174/221333202-05ccda84-aa5c-434c-a6c7-87ae67827db1.png">
</p>

Submission: 

●	First, zip the src folder of your project and submit the zip file to the ungraded assignment named “Lab0CodeSubmission”. One submission from each team.

●	Paste all your source code here inside this lab report, so that I could comment on your code if applicable.

●	Paste a screenshot of a run of your program (like the ones given above) inside this lab report.

●	Save this report in PDF, then each student needs to submit the pdf report to the graded assignment named “Lab0ReportSubmission”.
