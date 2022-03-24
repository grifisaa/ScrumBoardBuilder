<template>
  <Title words="ScrumBoardBuilder" style="border: black"></Title>
  <Button title="Add task" align="left" ></Button>
  <Button title="Split user story" align="left" ></Button>
  <Textbox></Textbox>
</template>

<script>
import Button from "@/components/Button";
import Title from "@/components/Title";
import Textbox from "@/components/Textbox";
export default {
  name: 'App',
  components: {
    Button,
    Title,
    Textbox,
  }
}
</script>

<style>
#app {
  font-family: "Roboto Light", sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
  background: #c9d4d4;
  height: 500px;
  padding: 20px;
}
</style>
