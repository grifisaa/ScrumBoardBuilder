<template>
  <div class="container">
    <h1 id="scrumHead">Scrum Board</h1>

    <div class="paneContainer">
      <pane-project-backlog @delete-userstory="deleteUserstory" :user-story="userStory" />
    </div>
    <div class="paneContainer">
      <pane-sprint-backlog @delete-userstory="deleteUserstory" :user-story="userStory"/>
    </div>
    <div class="paneContainer">
      <pane-in-progress @delete-userstory="deleteUserstory" :user-story="userStory"/>
    </div>
    <div class="paneContainer">
      <pane-ready @delete-userstory="deleteUserstory" :user-story="userStory"/>
    </div>
    <div class="paneContainer">
      <pane-test @delete-userstory="deleteUserstory" :user-story="userStory"/>
    </div>
    <div class="paneContainer">
      <pane-done @delete-userstory="deleteUserstory" :user-story="userStory"/>
    </div>

  </div>

</template>

<script>
import paneProjectBacklog from "@/components/paneProjectBacklog";
import paneSprintBacklog from "@/components/paneSprintBacklog";
import paneInProgress from "@/components/paneInProgress";
import paneReady from "@/components/paneReady";
import paneTest from "@/components/paneTest";
import paneDone from "@/components/paneDone";
//import Userstory from "@/components/Userstory";
export default {
  name: 'App',
  components: {
    paneProjectBacklog,
    paneSprintBacklog,
    paneInProgress,
    paneReady,
    paneTest,
    paneDone,
    //Userstory,
  },
  data() {
    return {
      userStory: [],
    }
  },
  methods: {
    deleteUserstory(id) {
      if(confirm('confirm delete')) {
        this.userStory = this.userStory.filter((userstory) => userstory.id !== id)
      }
    },
  },
  created() {
    this.userStory = [
      {
        id: '1',
        title: 'test1',
        description: 'short desc',
        acceptanceCriteria: 'test acceptance criteria',
        pane: 'paneProjectBacklog',
      },
      {
        id: '2',
        title: 'test2',
        description: 'short desc',
        acceptanceCriteria: 'test acceptance criteria',
        pane: 'paneSprintBacklog',
      },
      {
        id: '3',
        title: 'test3',
        description: 'short desc',
        acceptanceCriteria: 'test acceptance criteria',
        pane: 'paneInProgress',
      },
      {
        id: '4',
        title: 'test4',
        description: 'short desc',
        acceptanceCriteria: 'test acceptance criteria',
        pane: 'paneProjectBacklog',
      },
      {
        id: '5',
        title: 'test5',
        description: 'short desc',
        acceptanceCriteria: 'test acceptance criteria',
        pane: 'paneProjectBacklog',
      },
      {
        id: '6',
        title: 'test6',
        description: 'short desc',
        acceptanceCriteria: 'test acceptance criteria',
        pane: 'paneProjectBacklog',
      },
      {
        id: '7',
        title: 'test7',
        description: 'short desc',
        acceptanceCriteria: 'test acceptance criteria',
        pane: 'paneProjectBacklog',
      },
      {
        id: '8',
        title: 'test8',
        description: 'short desc',
        acceptanceCriteria: 'test acceptance criteria',
        pane: 'paneProjectBacklog',
      },
      {
        id: '9',
        title: 'test9',
        description: 'short desc',
        acceptanceCriteria: 'test acceptance criteria',
        pane: 'paneProjectBacklog',
      },
      {
        id: '10',
        title: 'test10',
        description: 'short desc',
        acceptanceCriteria: 'test acceptance criteria',
        pane: 'paneProjectBacklog',
      },
      {
        id: '11',
        title: 'test11',
        description: 'short desc',
        acceptanceCriteria: 'test acceptance criteria',
        pane: 'paneProjectBacklog',
      },
      {
        id: '12',
        title: 'test12',
        description: 'short desc',
        acceptanceCriteria: 'test acceptance criteria',
        pane: 'paneProjectBacklog',
      },
    ]
  },
}
</script>

<style>
#app {
  font-family: "Roboto Light", sans-serif;
  background: whitesmoke;
}
.container {
  background: #c9d4d4;
  margin: 30px auto;
  overflow-x: scroll;
  min-height: 300px;
  border: 1px solid steelblue;
  border-radius: 5px;
  white-space: nowrap;
}
.paneContainer {
  background: whitesmoke;
  border: 1px solid black;
  margin: 5px;
  text-align: center;
  max-width: 300px;
  min-width: 300px;
  display:inline-block;

}
#scrumHead {
  margin-top: 5px;
  margin-left: 5px;
}



</style>