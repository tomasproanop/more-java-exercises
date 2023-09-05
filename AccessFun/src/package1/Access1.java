package package1;

public class Access1 {
	
	//dafault, public, private, protected
	
	//default: everything visible inside the package

	int hours = 3;
	int minutes = 47;
	
	//public: even outside package can see
	
	public int hours2 = 3;
	public int minutes2 = 47;
	
	//private: only the file
	
	//private int hours3 = 4
	
	//protected: withhin packege and via "extends"
	//protected int hours4 = 5

}
