# Abstract-Factory-Design-Pattern


QUESTION :

You have graduated and after several interviews you have finally
managed to land a job at the newly founded “Iflas-Technologies Ltd”.
The company has decided to make and sell smartphones. Every smartphone consists of 6
components, and the company produces 3 distinct model series: Maximum Effort,
IflasDeluxe and I-I-Aman-Iflas.

The production of a phone is carried out in the following order: a) attach cpu & ram to the
board, b) attach display, c) attach battery, d) attach storage, e) attach camera and f)
enclose the phone case.
The situation is further complicated, as your company sells the same models, with different
specifications to different markets. For instance the same model IflasDeluxe is sold in
Turkey with a 5.3 inch, 32bit display while it’s sold at the EU market with a 5.3 inch but 24-
bit display and so on:


You are to produce a piece of software to manage the production of these smartphones.
Being a fan of OOP, you immediately take precautions for future models that might use
some of the same components and decide to use the Abstract Factory design pattern.
Develop a Java program where you implement the Abstract Factory design pattern for the
production of smartphones. Make sure you draw the class diagram and have a main
method, where you print on screen step by step the production phases of every model
from every market.



REPORT:

Display, Battery, CPU & Ram, Storage, Camera, and Case, features differ for 3
different regions.
I opened special stores in these regions, and I produced the features in a
different factory for each region.
This design is known as the abstract factory design pattern.
The same features are valid for 3 different smart phones. However, I solved
them with an abstract creation method known as the factory method.
Due to this design pattern I have made, if a different model or a store is opened
in a different region in the future, I will reflect this to the code at a low cost.

