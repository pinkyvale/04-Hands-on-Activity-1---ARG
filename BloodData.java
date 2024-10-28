class BloodData {
    static String bloodType; //A, B, AB, O
    static String rhFactor; //+ or -
    
    public BloodData(){
        bloodType = "O";
        rhFactor = "+";
    }
    
    public BloodData(String bt, String rh){
        this.bloodType = bt; //A
        this.rhFactor = rh;
    }
    public void display(){
        System.out.println(bloodType + rhFactor + " is added to the blood bank.");
    }
}
