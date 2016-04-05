Feature: Edit blog
As a blog owner
I can edit my blog posts
Scenario: Edit blog 
#Given there is a post titled with "Dummy post" and content with "Dummy content"
Given a post exists with title: "Dummy post", content: "Dummy content"
When I am on the post's page
And I update title to "Updated title" and content to "Updated content"
Then I can see it has been updated