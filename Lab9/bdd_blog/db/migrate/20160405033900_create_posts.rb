class CreatePosts < ActiveRecord::Migration
  def change
    create_table :posts do |t|
      t.string :title
      t.textpost_time :content
      t.timestamps
    end
  end
end
