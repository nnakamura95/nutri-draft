package nutri.api.infrastructure.datasource.client;

import nutri.api.domain.model.Client;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ClientMapper {

//    @Select("SELECT id, client_number, name, email, health_condition FROM client.data WHERE id = #{id}")
    Client getClientById(int id);
}
