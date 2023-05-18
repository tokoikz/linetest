<template>
  <!-- UI components here -->
  <button @click="sendRichMessage">Send Message</button>
</template>

<script>
import axios from 'axios';

export default {
  data: () => ({
    token: 'iE3hN5dMY12tOF/tTEYnDeMMvxGEXJcrVn+zBk1xF22VulUQzoJrYYMYXjcsia3rWT3eqR9Sn1+1DBBxoa72s8TpGAbTJg91BBPaCiIG49wWovWZvEocVqpvJB1PckNuG6SbJJT++8PDzVXPiF1A7AdB04t89/1O/w1cDnyilFU=',
    useId: 'eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJodHRwczovL2FjY2Vzcy5saW5lLm1lIiwic3ViIjoiVTg0YjA2M2MzOWExMzE5Y2VjOGVhMDgzOGE4Njg2Yjc2IiwiYXVkIjoiMTY2MDkyODUxNCIsImV4cCI6MTY4NDMwOTM1NiwiaWF0IjoxNjg0MzA1NzU2LCJub25jZSI6Ik5PTkNFIiwiYW1yIjpbImxpbmVzc28iXSwibmFtZSI6ImthenVub3JpIiwicGljdHVyZSI6Imh0dHBzOi8vcHJvZmlsZS5saW5lLXNjZG4ubmV0LzBocDMwT2hpNmhMeHdOTmoxQnZwTlFTekZ6SVhGNkdDbFVkVlZvY3kwX0puZ2tBVHdZTlZGZ0xpMDBjaXdtVW1wTU9RSmxleTh6ZEh3ayIsImVtYWlsIjoidHJ1c3RzcG9ydDEycXVydWxpQGdtYWlsLmNvbSJ9.aS7aZdFvf4M0EA-SQyWVKfaalRPdbTWRTHxsEyukISI'
  }),
  methods: {
    sendRichMessage() {
      const headers = {
        "Authorization": "Bearer" + this.token,
        "Content-Type": "application/json"
      };

      const data = {
        "to": this.useId,
        "messages": [
          {
            "type": "template",
            "altText": "This is a buttons template",
            "template": {
              "type": "buttons",
              "thumbnailImageUrl": "https://example.com/original.jpg",
              "imageAspectRatio": "rectangle",
              "imageSize": "cover",
              "imageBackgroundColor": "#FFFFFF",
              "title": "Menu",
              "text": "Please select",
              "defaultAction": {
                "type": "uri",
                "label": "View detail",
                "uri": "http://example.com/page/123"
              },
              "actions": [
                {
                  "type": "postback",
                  "label": "Buy",
                  "data": "action=buy&itemid=123"
                },
                {
                  "type": "postback",
                  "label": "Add to cart",
                  "data": "action=add&itemid=123"
                },
                {
                  "type": "uri",
                  "label": "View detail",
                  "uri": "http://example.com/page/123"
                }
              ]
            }
          }
        ]
      };

      axios
        .post('https://api.line.me/v2/bot/message/push', data, { headers })
        .then(response => {
          console.log(response.data);
        })
        .catch(error => {
          console.error(error);
        });
    }
  }
};
</script>
