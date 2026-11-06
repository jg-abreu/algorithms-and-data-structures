class Solution {
    public int[] topKFrequent(int[] nums, int k) {

        // 1. Contar quantas vezes cada número aparece
        HashMap<Integer, Integer> count = new HashMap<>();

        for (int n : nums) {
            if (count.containsKey(n)) {
                count.put(n, count.get(n) + 1);   // já existe: soma 1
            } else {
                count.put(n, 1);                  // primeira vez: começa em 1
            }
        }

        // 2. Criar os baldes (um para cada frequência possível, de 0 até n)
        ArrayList<ArrayList<Integer>> buckets = new ArrayList<>();

        for (int i = 0; i <= nums.length; i++) {
            buckets.add(new ArrayList<>());
        }

        // Colocar cada número no balde da sua frequência
        for (int number : count.keySet()) {
            int frequency = count.get(number);
            buckets.get(frequency).add(number);
        }

        // 3. Pegar os números, do balde maior para o menor
        int[] result = new int[k];
        int position = 0;

        for (int i = buckets.size() - 1; i > 0; i--) {
            for (int number : buckets.get(i)) {
                result[position] = number;
                position++;

                if (position == k) {
                    return result;
                }
            }
        }

        return result;
    }
}
