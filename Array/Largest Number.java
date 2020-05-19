public class Solution {
    public String largestNumber(final List<Integer> arr) {

		List<Integer> temp = new ArrayList<Integer>(arr);

		Collections.sort(temp, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				String s1 = o1 + "" + o2;
				String s2 = o2 + "" + o1;
				return greater(s1, s2) ? -1 : 1;

			}

			private boolean greater(String s1, String s2) {

				int i = 0;

				while (i < s1.length()) {

					int n1 = s1.charAt(i) - '0';
					int n2 = s2.charAt(i) - '0';

					if (n1 > n2) {
						return true;
					}

					else if (n1 < n2)
						return false;

					i++;

				}

				return true;

			}
		});

		StringBuilder sb = new StringBuilder();
		boolean flag = true;

		for (int i = 0; i < arr.size(); i++) {
			if (temp.get(i).equals(0)) {
				if (sb.length() > 0)
					sb.append(temp.get(i));

				flag = false;
			}
			
			else
				sb.append(temp.get(i));
		}

		if (!flag && sb.length() == 0)
			sb.append("0");

		return sb.toString();

	}
}
