import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class VectorDataset implements LabeledDataset{
	
	private ArrayList<Integer> label = new ArrayList<Integer>();
	private ArrayList<float []> data = new ArrayList<float []>();
	
	private int size = 0;
	
	
	//Constructor
	public VectorDataset(String fileName){
		File file = new File(fileName);
		try {
			Scanner input = new Scanner(file);
			String[] line = input.nextLine().split(",");
			
			//System.out.println(Arrays.toString(input.nextLine().split(",")));
			while (input.hasNextLine()){
				String[] thisLine = input.nextLine().split(",");
				label.add(Integer.parseInt(thisLine[0]));
				float [] feature = new float[line.length-1];
				for (int i = 0; i<feature.length; i++){
					feature[i] = Float.parseFloat(thisLine[i+1]);
				}
				//System.out.println("feature "+Arrays.toString(feature));
				data.add(feature);
				
				size++;
			}
			input.close();
		} catch (IOException e) {
			System.out.println(e);
		}
	}
	
	//Get label
	public int getLabel(int i) {
		if (i<0 || i>=size)
			return -1;
		return label.get(i);
	}
	
	//Get distance
	public float distance(int i, LabeledDataset other, int j) {
		float distance = 0;
		float [] thisF = getFeatures(i);
		//System.out.println("thisF "+Arrays.toString(thisF));
		VectorDataset that = (VectorDataset) other;
		float [] thatF = that.getFeatures(j);
		//System.out.println("thatF "+Arrays.toString(thatF));
		for (int a = 0; a<this.getDimensionality(); a++){
			distance+=Math.pow(thisF[a]-thatF[a], 2);
		}
		distance = (float) Math.sqrt(distance);
		
		return distance;
	}
	
	//Get size
	public int size() {
		return size;
	}
	
	//Get features
	public float [] getFeatures(int i){
		if (i<0 || i>=size)
			return null;
		//System.out.println("feature "+Arrays.toString(data.get(i)));
		return data.get(i);
	}
	
	//Get dimensionality
	public int getDimensionality(){
		return data.get(0).length;
	}
	
	//To string method
	public String toString(){
//		for (int i = 0; i< data.size(); i++){
//			
//			System.out.println("feature "+Arrays.toString(data.get(i)));
//		}
		return "Number of data is: "+size+"\n"+"Dimensionality of data is: "+this.getDimensionality();
	}

}
