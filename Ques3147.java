public class Ques3147 {
    public static int maximumEnergy(int[] energy, int k) {
    int n = energy.length;
    int maxEnergy = Integer.MIN_VALUE;

    // Iterate backward through the array
    // For each element, add the value of the element k steps ahead.
    // This way, each element energy[i] will store the total sum of its sequence.
    for (int i = n - k - 1; i >= 0; i--) {
        energy[i] += energy[i + k];
    }

    // After the first loop, the energy array is updated with the total sums.
    // Now, we just need to find the maximum value in the modified array.
    for (int i = 0; i < n; i++) {
        if (energy[i] > maxEnergy) {
            maxEnergy = energy[i];
        }
    }

    return maxEnergy;
    }
    public static void main(String args[]){
        int[] energy = {};
        int k = 3;
        System.out.println(maximumEnergy(energy, k));
    }
}
