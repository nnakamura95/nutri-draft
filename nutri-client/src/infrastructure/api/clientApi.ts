import {Client} from '@/types/Client';
import Auth from '@/infrastructure/api/Auth';

export default {
    async saveClient(client: Client) {
        const auth = new Auth();
        const response = await auth.post('/client', client);
        return response.data;
    },
};
