class Contact {
    private String personName;
    private String personId;
    private int age;
    private String mobileNumber;
	private char gender;

    
    public Contact() {
		 System.out.println("E-Constructor");
    }

    public Contact(String personName, String personId, int age, String mobileNumber, char gender) {
        setPersonName(personName);
        setPersonId(personId);
       setAge(age);
    setMobileNumber(mobileNumber);
        setGender(gender);
    }
    public void setPersonName(String personName) {
        this.personName = personName;
    }
   public String getPersonName() {
        return personName;
    }
    public void setPersonId(String personId) {
        this.personId = personId;
    }
   public String getPersonId() {
        return personId;
    }
   public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }
    public String getMobileNumber() {
        return mobileNumber;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }
    public char getGender() {
        return gender;
    }
    
    public void showDetails() {
        System.out.println("Person Name: " + personName);
        System.out.println("Person ID: " + personId);
        System.out.println("Age: " + age);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Gender: " + gender);
        System.out.println();
    }
   public void showOperator() {
        char thirdChar = mobileNumber.charAt(2);
        if (thirdChar == '3' || thirdChar == '7' ) {
            System.out.println("Operator: GP");
        } else if (thirdChar == '8') {
            System.out.println("Operator: Robi");
        } else {
            System.out.println("Operator: Unknown");
        }
    }
}
	public class Start02
{
    public static void main(String[] args) 
	{
       
        Contact c1 = new Contact("Shaon", "1345", 30, "017xxxxxxx", 'M');
        Contact c2 = new Contact("Sultana", "67670", 18, "018xxxxxxx", 'F');
        Contact c3 = new Contact("Shihab", "12378", 20, "013xxxxxxxx", 'M');
        Contact c4 = new Contact("Shifa", "67565", 28, "019xxxxxxxx", 'F');
       c1.showDetails();
        c1.showOperator();
        c2.showDetails();
        c2.showOperator();
        c3.showDetails();
        c3.showOperator();
        c4.showDetails();
        c4.showOperator();
		
    }
}
