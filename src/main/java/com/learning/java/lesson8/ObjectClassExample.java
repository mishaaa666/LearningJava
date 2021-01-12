package com.learning.java.lesson8;

public class ObjectClassExample {

    public static void main(String[] args) {
        
        Pet nika = new Pet("Nika", "Anatolii");
        System.out.println("nika = " + nika);

        Pet somePet = nika;
        changeOwner(nika, "Oksana");
        System.out.println("nika = " + nika);




        int age = 18;
        System.out.println("age = " + age);
        changeAge(age);
        System.out.println("age = " + age);
        
    }

    private static void changeAge(int age) {
        age = 20;
    }

    private static void changeOwner(Pet pet, String newOwnerName){
        pet.setOwnerName(newOwnerName);
        pet = new Pet("Crazy Cat", "Homeless");
    }

    public static class Pet {
        private String name;
        private String ownerName;

        public Pet(String name, String ownerName) {
            this.name = name;
            this.ownerName = ownerName;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getOwnerName() {
            return ownerName;
        }

        public void setOwnerName(String ownerName) {
            this.ownerName = ownerName;
        }

        @Override
        public String toString() {
            return "Pet{ " +
                    "name='" + name + '\'' +
                    ", ownerName='" + ownerName + '\'' +
                    '}';
        }
    }
    
}
