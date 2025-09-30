/*
Rachel White
03/24/2024
Comp167; section 003
I am creating a code for is the code that put everything together. In this code I
will print out character : L for Lawn Tractor, C for Commercial, G for Gas powered,
 and P for Push reel. I will create a while and if staements instead of a seitch case
 to print.

*/
import javax.swing.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.FileInputStream;
import java.io.File;
import java.io.PrintWriter;

public class MowerWareHouse {
    private static String storeName;
    private ArrayList<Mower> mowers = new ArrayList<>();
    public static MowerWareHouse yardRepair = new MowerWareHouse();



    public MowerWareHouse(){// Default constuctor

    }
    public void setMowers(ArrayList<Mower> mowerTrim) {
        this.mowers = mowerTrim;
    }
    public ArrayList<Mower> getMowers() {
        return mowers;
    }
    // Mutiple setter and getters for store name and to remove and add to Mowers

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStoreName() {
        return storeName;
    }
    public void addMower(Mower mowerToAdd) {
        getMowers().add(mowerToAdd);
    }




    public void removeMower(int yard) {
        if (getMowers().size() > 0){
            getMowers().remove(yard);
        }
    }






    public void setMower(int yard, Mower mowerToSet) {
        if (getMowers().size()>0) {
            getMowers().set(yard, mowerToSet);
        }
    }


    public Mower getMower(int yard) {
        return getMowers().get(yard);
    }






    public int getNumMowers() {


        return getMowers().size();
    }






    public void readMowerData(String inputFileName) throws IOException {
        try {
            FileInputStream myFile = new FileInputStream(inputFileName);
            Scanner fileReader = new Scanner(myFile);
            ArrayList<String> gardening = new ArrayList<>();

            while (fileReader.hasNextLine()) {
                String Manufacturer = fileReader.nextLine();
                int year = Integer.parseInt(fileReader.nextLine());
                String serialNumber = fileReader.nextLine();
                String line = fileReader.nextLine();
                gardening.add(line);
                String letter = fileReader.nextLine();
                if (letter.equals("L")) { // I created a new mower based on the type indicated in the file
                    LawnTractor lawn = new LawnTractor();
                    lawn.setManufacturer(Manufacturer);
                    lawn.setYear(year);
                    lawn.setSerialNumber(serialNumber);
                    lawn.getMyType();
                    lawn.getEngine().setManufacturer(fileReader.nextLine());
                    lawn.getEngine().setHoursePower(Double.parseDouble(fileReader.nextLine()));
                    lawn.getEngine().setCylinders(Integer.parseInt(fileReader.nextLine()));
                    lawn.setModel(fileReader.nextLine());
                    lawn.setDeckWidth(Double.parseDouble(fileReader.nextLine()));
                    if (fileReader.hasNextLine()) {
                        fileReader.nextLine();
                    }
                    mowers.add(lawn); // Add the lawn tractor to the list of mowers
                } else if (letter.equals("C")) {
                    CommercialMower Mow = new CommercialMower();
                    Mow.setManufacturer(Manufacturer);
                    Mow.setYear(year);
                    Mow.setSerialNumber(serialNumber);
                    Mow.getMyType();
                    Mow.getEngine().setManufacturer(fileReader.nextLine());
                    Mow.getEngine().setHoursePower(Double.parseDouble(fileReader.nextLine()));
                    Mow.getEngine().setCylinders(Integer.parseInt(fileReader.nextLine()));
                    Mow.setModel(fileReader.nextLine());
                    Mow.setDeckWidth(Double.parseDouble(fileReader.nextLine()));
                    Mow.setOperatingHours((Double.parseDouble(fileReader.nextLine())));
                    Mow.setZeroTurnRadius(fileReader.nextBoolean());
                    if (fileReader.hasNextLine()) {
                        fileReader.nextLine();
                    }
                    mowers.add(Mow);
                } else if (letter.equals("G")) {// I created a new mower based on the type G indicated in the file
                    GasPoweredMower GPM = new GasPoweredMower();
                    GPM.setManufacturer(Manufacturer);
                    GPM.setYear(year);
                    GPM.setSerialNumber(serialNumber);
                    GPM.getMyType();
                    GPM.getEngine().setManufacturer(fileReader.nextLine());
                    GPM.getEngine().setHoursePower(Double.parseDouble(fileReader.nextLine()));
                    GPM.getEngine().setCylinders(Integer.parseInt(fileReader.nextLine()));
                    GPM.setSelfPropelled(fileReader.nextBoolean());
                    if (fileReader.hasNextLine()) {
                        fileReader.nextLine();
                    }
                    mowers.add(GPM);// Add the GPM to the list of mowers
                } else if (letter.equals("P")) {
                    PushReelMower reel = new PushReelMower();
                    reel.setManufacturer(Manufacturer);
                    reel.setYear(year);
                    reel.setSerialNumber(serialNumber);
                    reel.getMyType();
                    reel.setWheelDiameter(Double.parseDouble(fileReader.nextLine()));
                    reel.setNumWheels(fileReader.nextInt());
                    if (fileReader.hasNextLine()) {
                        fileReader.nextLine();
                    }
                    mowers.add(reel);
                }
                fileReader.close();


            }
        } catch (FileNotFoundException e) {
            System.out.print("No File found");
            // Rethrow the exception to notify the caller
        } catch (NumberFormatException e) {
            throw new RuntimeException(e);
        }
    }


    public void saveMowerData(String outputFileName) {
        try (PrintWriter writer = new PrintWriter(outputFileName)) {
            writer.write(toString());

            for (Mower eachMower : this.mowers) {
                writer.write(eachMower + "\n");
            }
        } catch (IOException e) {
            System.out.println("No data for file");
        }


    }

    public String toString() {//Formats how the warehouse is outputted

        StringBuilder lawn = new StringBuilder();
        for (int i = 0; i < mowers.size(); i++) {
            lawn.append(mowers.get(i).toString()).append("\n");
        }


        return getStoreName() + "\n" + lawn;
    }

    public static void main(String[] args) throws IOException {
        Scanner scnr = new Scanner(System.in);
        if (args.length > 0) {
            String filer = args[0];
            File myFile = new File(filer);//open file with the filepath

            yardRepair.readMowerData(filer);

        } else {
            JFileChooser chooser = new JFileChooser();
            chooser.setCurrentDirectory(new File("/Users/rachelwhite/IdeaProjects/Project 2/src"));
            int value = chooser.showOpenDialog(null);// Opened the file and called upon
            if (value == JFileChooser.APPROVE_OPTION) {
                File selectedFile = chooser.getSelectedFile();
                System.out.println("Selected file: " + selectedFile.getAbsolutePath());//If no file was selected
            }
        }
        System.out.println("Enter your choice of Mower to get information");
        System.out.println("Type L for Lawn Tractor, C for Commercial, G for Gas powered, P for Push reel, and S to Stop");
        String input = scnr.next();
        while (!input.equals("S")) {  //Makes the program keep running until condition for while loop hits S for stop
            for (Mower mower : yardRepair.getMowers()) {
                if ((mower instanceof LawnTractor) && input.equals("L")) {
                    System.out.println(mower);
                } else if ((mower instanceof CommercialMower) && input.equals("C")) {
                    System.out.println(mower);
                } else if ((mower instanceof PushReelMower) && input.equals("P")) {
                    System.out.println(mower);
                } else if ((mower instanceof GasPoweredMower) && input.equals("G")) {
                    System.out.println(mower);
                }
            }

            System.out.println("Enter a choice again (L,C,G,P,S):");
            input = scnr.next();
        }
        scnr.close();
    }

}


















