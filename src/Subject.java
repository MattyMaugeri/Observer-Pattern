public interface Subject {
    /**
     * both of these methods take in an Observer as an argument; that is, the 
     * Observer to register or remove
     * @param o
     */
    public void registerObserver(Observer o);
    public void removeObserver(Observer o);

    /**
     * this method is called to notify all observers when a state in the Subject
     * has changed
     */
    public void notifyObserver();
}