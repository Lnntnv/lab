// задание 1
public String input() throws MyException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = null;
        try {
        s = reader.readLine();
        } catch (IOException e) {
        System.out.println(e.getMessage());
        } finally {
        try {
        reader.close();
        } catch (IOException e) {
        System.out.println(e.getMessage());
        if (s.equals("")) {
        throw new MyException("String can not be empty!");
        }
        return s;