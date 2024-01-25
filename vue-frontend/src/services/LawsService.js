import axios from "axios";

const LAWS_API_BASE_URL = 'http://localhost:8080/api/laws'


class LawsService{
    getLaws(){
        return axios.get('http://localhost:8080/api/laws');
    }
}


export default new LawsService()