package MainAutoProject;

import java.io.IOException;
import java.util.ArrayList;

public class sampletest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		dataDriven dD = new dataDriven();
		ArrayList data = dD.getdata("Add Profile");
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(4));
		System.out.println(data.get(3));
	}

}
