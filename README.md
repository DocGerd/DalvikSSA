# DalvikSSA
Dalvik SSA Frontend


# Introduction
On October 21, 2008 Google made the Android operating system for mobile phones
available. Android had a fast grow in functionality and distribution throughout the
world. In 2010 Android's market share was 22.7% which made it the second most sold
operating system, preceded only by Symbian.
Android's base is a Linux-kernel, usually programmes are written in Java and must be
compiled with the Android-SDK. Normally compiling Java code creates bytecode (see
next chapter) which is run in a virtual machine (VM), Android uses a special form of
bytecode. The main difference is, that Bytecode of Java on PC is run in the Java-VM,
which is stack-based, Android uses its own virtual machine called Dalvik-VM, which
uses register-based instructions.
There are many Android applications, so-called apps. Each day the amount of apps is
growing. For many reasons it makes sense to analyse the code of an app, e.g. to follow
"confidential" data to see whether it is passed outside unintentionally or to find spots
for potential optimisations.
There are already frameworks to create analysis tools, such as:
- WALA [Wal]
- Soot [Soo]

Unfortunately there are no frameworks which support data-flow analysis on Android
bytecode. Our target is to create such an analysis tool for Android bytecode by extending
one of the currently available frameworks. These frameworks use an intermediate
language to increase extendability for new languages and to simplify later algorithms,
the static single assignment (SSA) form showed to be useful for that. Frontends which
translate this intermediate language are already available for Java, JavaScript and Bytecode.
In SSA, per denition, each variable may only be dened once. After branches, i.e.
if...else, we would need to decide which of the denitions is used later in the programme.
This is decided by so-called phi-functions. Besides inserting those phi-functions,
we have to rename all variables to have a given code in SSA-form.
This and further explanations will be shown in the next chapter.
As such a frontend is missing for Android bytecode, it appears practical to create one
for WALA. This work takes the first important steps needed to create such a frontend.
