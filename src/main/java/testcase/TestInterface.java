package testcase;

interface interfaceOne{
	public abstract void display(); //metodo sin implementar
	String getMsg(String str);  //metodo sin implementar
}


interface interfaceTwo{
	void showInt();
}


class baseClass implements interfaceOne,interfaceTwo {

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.err.println("Interface One Method 1");
	}

	@Override
	public String getMsg(String str) {
		// TODO Auto-generated method stub
		return str;
	}

	@Override
	public void showInt() {
		// TODO Auto-generated method stub
		System.err.println("Inter Fase two: 10");
		
	}
	
}



public class TestInterface {
	
	public static void main(String[] args){
		//baseClass obj = new baseClass();
		
		interfaceOne obj = new baseClass();
		interfaceTwo obj2 = new baseClass();
		obj.display();
		System.err.println("Value: "+obj.getMsg("Method 2"));
		obj2.showInt();
		
	}

}
