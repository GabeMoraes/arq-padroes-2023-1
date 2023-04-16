public interface ClientDAO {
    
    void save(Client client);

    void update(Client client, String[] params);

    void delete(Client client);
}
