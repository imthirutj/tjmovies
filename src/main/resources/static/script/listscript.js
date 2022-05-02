 async function getdata(){
        const params = (new URL(location)).searchParams;
        const id=params.get('id');
        
        const url="https://api.themoviedb.org/3/movie/"+id+"?api_key=bfac75eed7ea2964815538e5c47534fa&language=en-US";
        
        const response=await fetch(url);
        
        const data= await response.json();
        
        document.getElementById("mv_name").innerHTML=data.original_title;
        const img ='https://image.tmdb.org/t/p/w1066_and_h600_face/'+data.backdrop_path;
        const desc=data.overview;
        document.getElementById("desc").innerHTML=desc;
        
        document.getElementById("iframe-embed").src='https://www.2embed.ru/embed/tmdb/movie?id='+id;
      
        
        
        //backimagee
      
        document.getElementById("banner").style.backgroundImage='url('+img+')';

        //videologo
    //    console.log(data.belongs_to_collection.backdrop_path);
    //     document.getElementById("video-id").poster="https://image.tmdb.org/t/p/w533_and_h300_face"+data.belongs_to_collection.backdrop_path;
		
         	//maglink
         	document.getElementById("addmag").href ="/magLinkForm?Id="+id;
       
        }
        getdata();