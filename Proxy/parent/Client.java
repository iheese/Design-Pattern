package parent;

public interface Client {
    public String getName();
    public abstract Long getAmount();
    public abstract String getInformation(Client client);
}
