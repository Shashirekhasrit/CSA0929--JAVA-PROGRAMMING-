# CSA09 Assignment 1 – Campus Smart-Parking System (Complete Java Pack)

This ZIP contains runnable `.java` source files for Tasks 1–12 and a separate detailed explanation document: `EXPLANATIONS.docx`.

## Important
- Use **JDK 17 or later**.
- The Java files are the practical examples/implementations. The explanation document contains the written analysis, pseudocode, UML, alternatives, Big-O, test plan and viva notes.
- Run each task yourself and capture your own screenshots. Do not claim screenshots or measurements that you did not produce. Review and understand the code before submission.
- Fill your name, register number and GitHub URL in the report/README before submitting.

## Compile and run (Windows CMD)
Open CMD in the extracted folder. For standalone tasks:

```bat
cd Task03
javac ParkingFacility.java
java ParkingFacility
```

Use the matching folder and class name for Tasks 1, 2, 4, 5, 6, 7, 8, 9 and 10. Example Task 8:

```bat
cd Task08
javac FeeDemo.java
java FeeDemo
```

For Tasks 11 and 12 (packages):

```bat
cd Task11
javac -d out src\parking\app\Main.java src\parking\model\*.java src\parking\service\*.java
java -cp out parking.app.Main
```

Repeat with `Task12` in place of `Task11`.

## Expected key outputs
Task 3: `[0, 0]`, `[0, 1]`, `[1, 0]`, `null`, `true false false`, `[0, 1]`.
Task 8: TwoWheeler Rs 30.0; Car Rs 90.0; ElectricCar Rs 210.0; final `true`.
Task 11: three tickets; fees 20.0, 60.0, 120.0; collection 200.0.
Task 12: e-bike 25.0; van 120.0; one-day pass 40.0; two-wheeler 10.0; collection 195.0.

## GitHub submission checklist
1. Create repository `CSA09-<RegisterNumber>-Assignment1`.
2. Upload this folder structure, README, all `.java` files and `EXPLANATIONS.docx`.
3. Execute every program; save genuine terminal screenshots in each task folder.
4. Add your own name/register number/JDK version/repository URL.
5. Commit task-by-task (not one final bulk commit), then share the working repository link with faculty.
