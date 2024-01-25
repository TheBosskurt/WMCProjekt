<template>
<div class="container">
    <h1 class="text-center">LawList</h1>
    <table class="table table-striped">
        <thead>
            <th>gesetz</th>
            <th>typ</th>
            <th>bezeichnung</th>
            <th>text</th>
            <th>gueltigkeit</th>

        </thead>
        <tbody>
            <tr v-for = 'law in laws' v-bind:key = "law.id">
                <td> {law.id}</td>
                <td> {law.gesetz}</td>
                <td> {law.typ}</td>
                <td> {law.bezeichnung}</td>
                <td> {law.text}</td>
                <td> {law.gueltigkeit}</td>            
            </tr>
        </tbody>
    </table>
</div>

</template>

<script>
import LawsService from '../services/LawsService'
export default{
    name:'LawsList',
    data(){
        return{
            laws :[]

        } 
        
    },
    methods: {
        getLaws(){
            LawsService.getLaws().then((response)=>{
                this.laws = response.data;
            })
        }
    },
    created(){
        this.getLaws()
    }
}
</script>

