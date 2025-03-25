public class Flat {
    private int squareFeet;
    private int pricePerSquareFeet;
    private int floorNumber;
    private int numberOfRooms;

    public Flat(int _squareFeet, int _pricePerSquareFeet, int _floorNumber, int _numOfRooms ){
        squareFeet = _squareFeet;
        pricePerSquareFeet = _pricePerSquareFeet;
        floorNumber = _floorNumber;
        numberOfRooms = _numOfRooms;
    }

    public int getFlatPrice(){
        return squareFeet*pricePerSquareFeet;
    }
    public void printAllValues(){
        System.out.println("Square feet: "+ squareFeet);
        System.out.println("Price per Square Feet: "+ pricePerSquareFeet);
        System.out.println("Floor Number: "+ floorNumber);
        System.out.println("Number of Rooms: "+ numberOfRooms);
    }
}
