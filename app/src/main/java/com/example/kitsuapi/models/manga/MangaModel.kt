package com.example.kitsuapi.models.manga

import com.example.kitsuapi.base.IBaseDiffModel
import com.example.kitsuapi.models.Attributes
import com.google.gson.annotations.SerializedName

data class MangaModel (
    @SerializedName("id")
    override val id: Int,
    @SerializedName("attributes")
    val attributes: Attributes
): IBaseDiffModel<Int>

//
//"data": [
//    {
//      "id": "1",
//      "type": "manga",
//      "links": {
//        "self": "https://kitsu.io/api/edge/manga/1"
//      },
//      "attributes": {
//        "createdAt": "2013-12-18T13:48:24.164Z",
//        "updatedAt": "2022-12-16T12:00:29.193Z",
//        "slug": "guardian-dog",
//        "synopsis": "Gengo Kurosaka leads a normal life until a run-away alien called \"Six-eyes\" decides to take refuge in his body. From then on, Gengo becomes Ishtar's target, a beautiful alien in charge of making sure the aliens don't turn planet Earth into hunting grounds. Gengo has now to learn to coexist with his parasite to stay alive...",
//        "description": "Gengo Kurosaka leads a normal life until a run-away alien called \"Six-eyes\" decides to take refuge in his body. From then on, Gengo becomes Ishtar's target, a beautiful alien in charge of making sure the aliens don't turn planet Earth into hunting grounds. Gengo has now to learn to coexist with his parasite to stay alive...",
//        "coverImageTopOffset": 0,
//        "titles": {
//          "en": null,
//          "en_jp": "Guardian Dog",
//          "en_us": "Guardian Dog"
//        },
//        "canonicalTitle": "Guardian Dog",
//        "abbreviatedTitles": [
//          "Guardian Dog"
//        ],
//        "averageRating": "71.48",
//        "ratingFrequencies": {
//          "2": "1",
//          "3": "0",
//          "4": "1",
//          "5": "0",
//          "6": "0",
//          "7": "0",
//          "8": "1",
//          "9": "0",
//          "10": "7",
//          "11": "0",
//          "12": "25",
//          "13": "1",
//          "14": "43",
//          "15": "0",
//          "16": "13",
//          "17": "0",
//          "18": "5",
//          "19": "0",
//          "20": "4"
//        },
//        "userCount": 129,
//        "favoritesCount": 1,
//        "startDate": "2005-01-01",
//        "endDate": null,
//        "nextRelease": null,
//        "popularityRank": 7703,
//        "ratingRank": 6583,
//        "ageRating": null,
//        "ageRatingGuide": null,
//        "subtype": "manga",
//        "status": "current",
//        "tba": null,
//        "posterImage": {
//          "tiny": "https://media.kitsu.io/manga/1/poster_image/tiny-b4be97beecfca5ba4eb744291405db76.jpeg",
//          "large": "https://media.kitsu.io/manga/1/poster_image/large-3210684af7bee6996926c63e5f16559e.jpeg",
//          "small": "https://media.kitsu.io/manga/1/poster_image/small-8014f18506a324ddf8318c4a74bf4c12.jpeg",
//          "medium": "https://media.kitsu.io/manga/1/poster_image/medium-5c1bd30a5d7538f9925796d3bbc013f4.jpeg",
//          "original": "https://media.kitsu.io/manga/poster_images/1/original.jpg",
//          "meta": {
//            "dimensions": {
//              "tiny": {
//                "width": 110,
//                "height": 156
//              },
//              "large": {
//                "width": 550,
//                "height": 780
//              },
//              "small": {
//                "width": 284,
//                "height": 402
//              },
//              "medium": {
//                "width": 390,
//                "height": 554
//              }
//            }
//          }
//        },
//        "coverImage": null,
//        "chapterCount": 22,
//        "volumeCount": 4,
//        "serialization": "Comic Rush",
//        "mangaType": "manga"
//      },
//      "relationships": {
//        "genres": {
//          "links": {
//            "self": "https://kitsu.io/api/edge/manga/1/relationships/genres",
//            "related": "https://kitsu.io/api/edge/manga/1/genres"
//          }
//        },
//        "categories": {
//          "links": {
//            "self": "https://kitsu.io/api/edge/manga/1/relationships/categories",
//            "related": "https://kitsu.io/api/edge/manga/1/categories"
//          }
//        },
//        "castings": {
//          "links": {
//            "self": "https://kitsu.io/api/edge/manga/1/relationships/castings",
//            "related": "https://kitsu.io/api/edge/manga/1/castings"
//          }
//        },
//        "installments": {
//          "links": {
//            "self": "https://kitsu.io/api/edge/manga/1/relationships/installments",
//            "related": "https://kitsu.io/api/edge/manga/1/installments"
//          }
//        },
//        "mappings": {
//          "links": {
//            "self": "https://kitsu.io/api/edge/manga/1/relationships/mappings",
//            "related": "https://kitsu.io/api/edge/manga/1/mappings"
//          }
//        },
//        "reviews": {
//          "links": {
//            "self": "https://kitsu.io/api/edge/manga/1/relationships/reviews",
//            "related": "https://kitsu.io/api/edge/manga/1/reviews"
//          }
//        },
//        "mediaRelationships": {
//          "links": {
//            "self": "https://kitsu.io/api/edge/manga/1/relationships/media-relationships",
//            "related": "https://kitsu.io/api/edge/manga/1/media-relationships"
//          }
//        },
//        "characters": {
//          "links": {
//            "self": "https://kitsu.io/api/edge/manga/1/relationships/characters",
//            "related": "https://kitsu.io/api/edge/manga/1/characters"
//          }
//        },
//        "staff": {
//          "links": {
//            "self": "https://kitsu.io/api/edge/manga/1/relationships/staff",
//            "related": "https://kitsu.io/api/edge/manga/1/staff"
//          }
//        },
//        "productions": {
//          "links": {
//            "self": "https://kitsu.io/api/edge/manga/1/relationships/productions",
//            "related": "https://kitsu.io/api/edge/manga/1/productions"
//          }
//        },
//        "quotes": {
//          "links": {
//            "self": "https://kitsu.io/api/edge/manga/1/relationships/quotes",
//            "related": "https://kitsu.io/api/edge/manga/1/quotes"
//          }
//        },
//        "chapters": {
//          "links": {
//            "self": "https://kitsu.io/api/edge/manga/1/relationships/chapters",
//            "related": "https://kitsu.io/api/edge/manga/1/chapters"
//          }
//        },
//        "mangaCharacters": {
//          "links": {
//            "self": "https://kitsu.io/api/edge/manga/1/relationships/manga-characters",
//            "related": "https://kitsu.io/api/edge/manga/1/manga-characters"
//          }
//        },
//        "mangaStaff": {
//          "links": {
//            "self": "https://kitsu.io/api/edge/manga/1/relationships/manga-staff",
//            "related": "https://kitsu.io/api/edge/manga/1/manga-staff"
//          }
//        }
//      }
//    },