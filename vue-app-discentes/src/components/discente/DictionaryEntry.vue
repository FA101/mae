
<script setup>
import { ref, toRefs } from 'vue';
// import { upvoteEntry, downvoteEntry } from '../services/api';

const props = defineProps({
  entry: Object,
});

const { entry } = toRefs(props);

// const handleUpvote = async () => {
//   await upvoteEntry(entry.id);
//   entry.upvotes++;
// };

// const handleDownvote = async () => {
//   await downvoteEntry(entry.id);
//   entry.downvotes++;
// };
</script>


<template>
    <div class="entry-card">
      
        <div class="card-top">
          <button>
            <h3> {{ entry.descricaoVerbete }} </h3>
          </button>
          <div class="entry-votes">
            <button class="vote">👍 {{ entry.upvote }}</button>
            <button class="vote">👎 {{ entry.downvote }}</button>
          </div>
        </div>
        <button>
          <p><strong>Top Comentário</strong> <br> {{ entry.conteudos }}</p>
        </button>

    </div>
  </template>
  
  
  <style scoped>
  .entry-card {
    border: 1px solid #63676C;
    width: 300px;
    height: 175px;
    padding: 0px 20px;
    border-radius: 20px;
    margin-bottom: 16px;
    overflow: hidden;
  }

  .card-top, .entry-card button {
    border: none;
    background-color: transparent;
    cursor: pointer;
  }

  .entry-votes button {
    margin-right: 8px;
  }

  .card-top {
    display: flex;
    align-items: center;
    justify-content: space-between;
  }

  .vote {
    border: none;
    background-color: transparent;
    cursor: pointer;
  }

  p {
    text-indent: 0;
    padding: 0;
    margin: 0;
    text-align: left;
    text-overflow: ellipsis;
  }
  </style>
 