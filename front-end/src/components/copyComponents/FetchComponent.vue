<template>
  <div>
    <ul>
      <li v-for="rapport in data" :key="rapport.id">
        {{rapport.name}}
      </li>
    </ul>
  </div>
</template>

<script>
export default {
  name: "Dashboard",
  data(){
    return {
      data:[],
    }
  },
  mounted(){
    fetch("http://localhost:8085")
      .then(response => {
        console.log(response)
        return response.json()
      }).then(data => {
        console.log(data)
        this.data =data
      })
  }
}
</script>

<style>

</style>