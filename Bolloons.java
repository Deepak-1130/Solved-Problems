class Balloons{
    public int maxNumberOfBalloons(String text) {
        String balloon = "balon";

        HashMap<Character, Integer> map = new HashMap<>();

        for (char ch : text.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < balloon.length(); i++) {
            char ch = balloon.charAt(i);

            int count = map.getOrDefault(ch, 0);

            if (ch == 'l' || ch == 'o') {
                count /= 2;
            }

            min = Math.min(min, count);
        }

        return min;
    }
    public static void main(String[] args){
        String text = "nlaebolko";
        System.out.print(maxNumberOfBalloons(text));
    }
}