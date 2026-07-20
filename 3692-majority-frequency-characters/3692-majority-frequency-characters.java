class Solution {
    public String majorityFrequencyGroup(String s) {
        HashMap<Character, Integer> charFreq = new HashMap<>();

for (char c : s.toCharArray()) {
    charFreq.put(c, charFreq.getOrDefault(c, 0) + 1);
}

HashMap<Integer, List<Character>> groups = new HashMap<>();

for (Map.Entry<Character, Integer> entry : charFreq.entrySet()) {
    groups.computeIfAbsent(entry.getValue(), k -> new ArrayList<>())
          .add(entry.getKey());
}

int bestFreq = -1;
int bestSize = -1;

for (Map.Entry<Integer, List<Character>> entry : groups.entrySet()) {
    int freq = entry.getKey();
    int size = entry.getValue().size();

    if (size > bestSize || (size == bestSize && freq > bestFreq)) {
        bestSize = size;
        bestFreq = freq;
    }
}

StringBuilder ans = new StringBuilder();

for (char c : groups.get(bestFreq)) {
    ans.append(c);
}

return ans.toString();
    }
}