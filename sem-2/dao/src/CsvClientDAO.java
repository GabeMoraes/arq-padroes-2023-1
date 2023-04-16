import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class CsvClientDAO implements ClientDAO {

    private List<Client> clients = new ArrayList<>();

    public CsvClientDAO(){
        clients.add(new Client("Gabriel", "gabriel@domain.com"));
    }
    
    @Override
    public void save(Client client) {
        clients.add(client);
    }

    @Override
    public void delete(Client client) {
        
    }

	@Override
	public void update(Client client, String[] params) {
		client.setName(Objects.requireNonNull(params[0], "Nome não pode ser vazio"));
        client.setName(Objects.requireNonNull(params[1], "Email não pode ser vazio"));
	}
    
}
