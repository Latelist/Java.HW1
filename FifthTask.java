// Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.

public class FifthTask {
    FifthTask() {
        String phrase = "Добро пожаловать на курс по Java";
        reversePrinter(splitter(phrase));
    }

    public String[] splitter(String phrase) {
        String[] words = phrase.split("\\s");
        return words;
    }
    public void reversePrinter(String[] words) {
        for (int i = words.length-1; i >= 0; --i) {
            System.out.print(words[i] + " ");
        }
    }
}
