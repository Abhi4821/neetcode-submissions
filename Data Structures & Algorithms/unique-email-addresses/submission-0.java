class Solution {
    public int numUniqueEmails(String[] emails) {

        HashSet<String> set = new HashSet<>();

        for (String email : emails) {

            String[] parts = email.split("@");

            String local = parts[0];
            String domain = parts[1];

            String[] temp = local.split("\\+");

            local = temp[0];

            local = local.replace(".", "");

            String finalEmail = local + "@" + domain;

            set.add(finalEmail);
        }

        return set.size();
    }
}