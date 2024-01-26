.class public final Lk0/g$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lm0/i;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lk0/g;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = null
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/lang/Class;)Lm0/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Lm0/h;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;)TT;"
        }
    .end annotation

    new-instance p1, Lk0/g;

    const/4 v0, 0x1

    invoke-direct {p1, v0}, Lk0/g;-><init>(Z)V

    return-object p1
.end method
