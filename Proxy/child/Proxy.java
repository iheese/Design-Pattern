package child;

import parent.Client;

public class Proxy implements Client {
    private Client client;

    public Proxy(Client client) {
        this.client = client;
    }
    @Override
    public String getName() {
        return client.getName();
    }

    @Override
    public Long getAmount() {
        return client.getAmount();
    }

    @Override
    public String getInformation(Client otherClient) {
        if(this.client.getName().equals(otherClient.getName())){
            return this.client.getInformation(otherClient);
        }
        return "다른 사람의 계좌는 확인하실 수 없습니다.";
    }
}
