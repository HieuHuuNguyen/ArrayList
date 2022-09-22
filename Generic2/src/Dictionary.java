public class Dictionary<K, V> {
    private Word<K, V> [] words;
    public Dictionary(Word<K, V>[] words){
        this.words=words;
    }

    public V findWord(K keySearch){
        for (Word<K, V> word : words){
            if(word.isKeyEquals(keySearch))
                return word.getValue();
        }
        return null;
    }
}
