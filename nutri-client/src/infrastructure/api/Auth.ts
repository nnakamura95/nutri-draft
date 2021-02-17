import Axios, {AxiosRequestConfig, AxiosResponse, AxiosPromise} from 'axios';

export default class Auth {

    private http = Axios.create();


    public async get<T = any, R = AxiosResponse<T>>(url: string, config?: AxiosRequestConfig): Promise<R> {
        return this.http.get(url, config);
    }

    public async post<T = any, R = AxiosResponse<T>>(url: string, data?: any): Promise<R> {
        return this.http.post(url, data);
    }

    public async put<T = any, R = AxiosResponse<T>>(url: string, data?: any, config?: AxiosRequestConfig): Promise<R> {
        return this.http.put(url, data, config);
    }

    public async delete<T = any, R = AxiosResponse<T>>(url: string, config?: AxiosRequestConfig): Promise<R> {
        return this.http.delete(url, config);
    }

}
