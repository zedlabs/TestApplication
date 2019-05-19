package tk.zedlabs.testapplication;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.List;

public class MainAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

   private List<Object> items;
   private final int GROUND = 1, MATCH = 2, TOURNAMENT = 3, POST = 4;

   public MainAdapter(List<Object> items){
       this.items = items;
   }

    public class ViewHolderGround extends RecyclerView.ViewHolder{

        //declarations of all the different elements in the row view
        public ImageView groundImage;
        public TextView groundName;
        public TextView groundAvailability;
        public TextView groundLocation;


        public ViewHolderGround(@NonNull View itemView) {
            super(itemView);

            //connecting the elements defined above with their xml
            groundImage = itemView.findViewById(R.id.imageViewGround);
            groundName = itemView.findViewById(R.id.textViewGroundName);
            groundAvailability = itemView.findViewById(R.id.textViewGroundStatus);
            groundLocation = itemView.findViewById(R.id.textViewGroundLocation);
        }

        public ImageView getGroundImage() {
            return groundImage;
        }

        public void setGroundImage(ImageView groundImage) {
            this.groundImage = groundImage;
        }

        public TextView getGroundName() {
            return groundName;
        }

        public void setGroundName(TextView groundName) {
            this.groundName = groundName;
        }

        public TextView getGroundAvailability() {
            return groundAvailability;
        }

        public void setGroundAvailability(TextView groundAvailability) {
            this.groundAvailability = groundAvailability;
        }

        public TextView getGroundLocation() {
            return groundLocation;
        }

        public void setGroundLocation(TextView groundLocation) {
            this.groundLocation = groundLocation;
        }
    }

    public class ViewHolderTour extends RecyclerView.ViewHolder{

        //declarations of all the different elements in the row view
        public ImageView tourImage;
        public TextView tourName;
        public TextView tourStatus;
        public TextView tourLocation;


        public ViewHolderTour(@NonNull View itemView) {
            super(itemView);

            //connecting the elements defined above with their xml
            tourImage = itemView.findViewById(R.id.imageViewtour);
            tourName = itemView.findViewById(R.id.textViewTourName);
            tourStatus = itemView.findViewById(R.id.textViewTourStatus);
            tourLocation = itemView.findViewById(R.id.textViewTourLocation);
        }

        public ImageView getTourImage() {
            return tourImage;
        }

        public void setTourImage(ImageView tourImage) {
            this.tourImage = tourImage;
        }

        public TextView getTourName() {
            return tourName;
        }

        public void setTourName(TextView tourName) {
            this.tourName = tourName;
        }

        public TextView getTourStatus() {
            return tourStatus;
        }

        public void setTourStatus(TextView tourStatus) {
            this.tourStatus = tourStatus;
        }

        public TextView getTourLocation() {
            return tourLocation;
        }

        public void setTourLocation(TextView tourLocation) {
            this.tourLocation = tourLocation;
        }
    }

    public class ViewHolderPost extends RecyclerView.ViewHolder{

        //declarations of all the different elements in the row view
        public ImageView postImage;
        public TextView userName;
        public TextView time;
        public TextView about;
        public TextView like;
        public TextView share;


        public ViewHolderPost(@NonNull View itemView) {
            super(itemView);

            //connecting the elements defined above with their xml
            postImage = itemView.findViewById(R.id.imageViewPost);
            userName = itemView.findViewById(R.id.textViewUser);
            time = itemView.findViewById(R.id.textViewTime);
            about = itemView.findViewById(R.id.textViewAbout);
            like = itemView.findViewById(R.id.textViewLikes);
            share = itemView.findViewById(R.id.textViewShares);
        }

        public TextView getLikes() {
            return like;
        }

        public void setLikes(TextView likes) {
            this.like = likes;
        }

        public TextView getShares() {
            return share;
        }

        public void setShares(TextView shares) {
            this.share = shares;
        }

        public ImageView getPostImage() {
            return postImage;
        }

        public void setPostImage(ImageView postImage) {
            this.postImage = postImage;
        }

        public TextView getUserName() {
            return userName;
        }

        public void setUserName(TextView userName) {
            this.userName = userName;
        }

        public TextView getTime() {
            return time;
        }

        public void setTime(TextView time) {
            this.time = time;
        }

        public TextView getAbout() {
            return about;
        }

        public void setAbout(TextView about) {
            this.about = about;
        }
    }

    public class ViewHolderMatch extends RecyclerView.ViewHolder{

        //declarations of all the different elements in the row view
        public ImageView team1;
        public ImageView team2;
        public TextView team1Name;
        public TextView team2Name;


        public ViewHolderMatch(@NonNull View itemView) {
            super(itemView);

            //connecting the elements defined above with their xml
            team1 = itemView.findViewById(R.id.imageViewT1);
            team2 = itemView.findViewById(R.id.imageView2T2);
            team1Name = itemView.findViewById(R.id.textViewName1);
            team2Name = itemView.findViewById(R.id.textViewName2);
        }

        public ImageView getTeam1() {
            return team1;
        }

        public void setTeam1(ImageView team1) {
            this.team1 = team1;
        }

        public ImageView getTeam2() {
            return team2;
        }

        public void setTeam2(ImageView team2) {
            this.team2 = team2;
        }

        public TextView getTeam1Name() {
            return team1Name;
        }

        public void setTeam1Name(TextView team1Name) {
            this.team1Name = team1Name;
        }

        public TextView getTeam2Name() {
            return team2Name;
        }

        public void setTeam2Name(TextView team2Name) {
            this.team2Name = team2Name;
        }
    }

    @Override
    public int getItemViewType(int position) {

        if (items.get(position) instanceof Ground) {
            return GROUND;
        } else if (items.get(position) instanceof Post) {
            return POST;
        } else if (items.get(position) instanceof Match) {
            return MATCH;
        } else if (items.get(position) instanceof Tournament) {
            return TOURNAMENT;
        }
        return -1;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup,int i) {

        RecyclerView.ViewHolder viewHolder;
        LayoutInflater inflater = LayoutInflater.from(viewGroup.getContext());

        switch (i) {
            case GROUND:
                View v1 = inflater.inflate(R.layout.item_ground, viewGroup, false);
                viewHolder = new ViewHolderGround(v1);
                break;
            case POST:
                View v2 = inflater.inflate(R.layout.item_post, viewGroup, false);
                viewHolder = new ViewHolderPost(v2);
                break;
            case TOURNAMENT:
                View v3 = inflater.inflate(R.layout.item_tournament, viewGroup, false);
                viewHolder = new ViewHolderTour(v3);
                break;
            case MATCH:
                View v4 = inflater.inflate(R.layout.item_match, viewGroup, false);
                viewHolder = new ViewHolderMatch(v4);
                break;
            default:
                View v = inflater.inflate(android.R.layout.simple_list_item_1, viewGroup, false);
                viewHolder = new ViewHolderMatch(v) ;
                break;
        }
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder viewHolder, int position) {
        switch (viewHolder.getItemViewType()) {
            case GROUND:
                ViewHolderGround vh1 = (ViewHolderGround) viewHolder;
                configureViewHolderGround(vh1, position);
                break;
            case MATCH:
                ViewHolderMatch vh2 = (ViewHolderMatch) viewHolder;
                configureViewHolderMatch(vh2, position);
                break;
            case POST:
                ViewHolderPost vh3 = (ViewHolderPost) viewHolder;
                configureViewHolderPost(vh3, position);
                break;
            case TOURNAMENT:
                ViewHolderTour vh4 = (ViewHolderTour) viewHolder;
                configureViewHolderTour(vh4, position);
                break;
            default:
                Log.e("mainActivity", "no viewholder to bind to");
                //RecyclerViewSimpleTextViewHolder vh = (RecyclerViewSimpleTextViewHolder) viewHolder;
                //configureDefaultViewHolder(vh, position);
                break;
        }
    }
    // private void configureDefaultViewHolder(RecyclerViewSimpleTextViewHolder vh, int position) {
    //    vh.getLabel().setText((CharSequence) items.get(position));
    //  }

    private void configureViewHolderGround(ViewHolderGround vh1, int position) {
        Ground ground = (Ground) items.get(position);
        if (ground != null) {
            vh1.getGroundName().setText(ground.getName());
            vh1.getGroundAvailability().setText(ground.getStatus());
            vh1.getGroundLocation().setText(ground.getLocation());
            Glide.with(vh1.getGroundImage()).load(ground.getImageUrl()).into(vh1.getGroundImage());
        }
    }

    private void configureViewHolderMatch(ViewHolderMatch vh2, int position) {
        Match match = (Match) items.get(position);
        if (match != null) {
            vh2.getTeam1Name().setText(match.getTeam1());
            vh2.getTeam2Name().setText(match.getTeam2());
            Glide.with(vh2.getTeam1()).load(match.getTeam1Logo()).into(vh2.getTeam1());
            Glide.with(vh2.getTeam2()).load(match.getTeam2Logo()).into(vh2.getTeam2());
        }
    }

    private void configureViewHolderPost(ViewHolderPost vh3, int position) {
        Post post = (Post) items.get(position);
        if (post != null) {
            vh3.getUserName().setText(post.getUsername());
            vh3.getTime().setText(post.getTime());
            vh3.getAbout().setText(post.getAbout());
            vh3.getLikes().setText(post.getLikes());
            vh3.getShares().setText(post.getShares());
            Glide.with(vh3.getPostImage()).load(post.getImageUrl()).into(vh3.getPostImage());

        }
    }
    private void configureViewHolderTour(ViewHolderTour vh4, int position) {
        Tournament t = (Tournament) items.get(position);
        if (t != null) {
            vh4.getTourName().setText(t.getName());
            vh4.getTourLocation().setText(t.getLocation());
            vh4.getTourStatus().setText(t.getStatus());
            Glide.with(vh4.getTourImage()).load(t.getImageUrl()).into(vh4.getTourImage());
        }
    }


    @Override
    public int getItemCount() {
       return items.size();
    }

}
