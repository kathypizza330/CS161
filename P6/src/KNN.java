import java.util.ArrayList;

public class KNN implements Classifier {

	private int neighbors;
	private LabeledDataset known;

	// Constructor
	public KNN(int k) {
		this.neighbors = k;
	}

	// Getter
	public int getK() {
		return neighbors;
	}

	// Setter
	public void setK(int k) {
		this.neighbors = k;
	}

	// Store provided data
	public void train(LabeledDataset trainingData) {
		this.known = trainingData;
	}

	public int classify(LabeledDataset testData, int i) {
		int knownSize = known.size();
		ArrayList<Float> distance = new ArrayList<Float>();
		ArrayList<Integer> labels = new ArrayList<Integer>();
		for (int a = 0; a < knownSize; a++) {
			distance.add(testData.distance(i, known, a));
			labels.add(known.getLabel(a));
		}
		sort(distance, labels);
		//System.out.println(distance);
		int[] possibleLabels = new int[neighbors];
		for (int a = 0; a < neighbors; a++) {
			possibleLabels[a] = labels.get(a);
		}

		return mostCommon(possibleLabels);
	}

	private int mostCommon(int[] a) {
		if (a.length == 1) return a[0];
		if (a.length < 1) return -1;
		int count = 0, tempCount;
		int popular = a[0];
		int temp = 0;
		for (int i = 0; i < (a.length - 1); i++) {
			temp = a[i];
			tempCount = 1;
			for (int j = 1; j < a.length; j++) {
				if (temp == a[j])
					tempCount++;
			}
			if (tempCount > count) {
				popular = temp;
				count = tempCount;
			}
		}
		return popular;
	}

	private void sort(ArrayList<Float> dis, ArrayList<Integer> lab) {
		int min;
		for (int i = 0; i < dis.size(); i++) {
			min = i;
			for (int j = i + 1; j < dis.size(); j++) {
				if (dis.get(j).compareTo(dis.get(min)) < 0)
					min = j;
			}
			changeF(dis, min, i);
			changeI(lab, min, i);
		}
	}

	private void changeF(ArrayList<Float> dis, int i, int j) {
		Float temp = dis.get(i);
		dis.set(i, dis.get(j));
		dis.set(j, temp);
	}

	private void changeI(ArrayList<Integer> lab, int i, int j) {
		int temp = lab.get(i);
		lab.set(i, lab.get(j));
		lab.set(j, temp);
	}

	public float evaluate(LabeledDataset testData) {
		float all = testData.size();
		float right = 0;
		for (int i = 0; i<all; i++){
			int foundLab = classify(testData, i);
			int trueLab = testData.getLabel(i);
			//System.out.println("found "+foundLab+" true "+trueLab);
			if (foundLab == trueLab)
				right +=1;
		}
		//System.out.println("all "+all+" right "+right);
		float precentage = right/all;
		return precentage;
	}

	public String toString() {
		return "Number of neighours is: " + this.neighbors;
	}
	
	public static void main(String[] args) {
		VectorDataset trainingData = new VectorDataset("training.data");
		VectorDataset testingData = new VectorDataset("testing.data");
		KNN knn = new KNN(7);
		knn.train(trainingData);
		System.out.println("accuracy: " + knn.evaluate(testingData));
	}
}
