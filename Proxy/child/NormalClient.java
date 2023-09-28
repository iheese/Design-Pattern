package child;

import parent.Client;

public class NormalClient implements Client {
    private String name;
    private Long amount;

    public NormalClient(String name, Long amount) {
        this.name = name;
        this.amount = amount;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Long getAmount() {
        return amount;
    }

    @Override
    public String getInformation(Client client) {
        return "성함: " + client.getName() + ", 잔액: " + client.getAmount();
    }
}
