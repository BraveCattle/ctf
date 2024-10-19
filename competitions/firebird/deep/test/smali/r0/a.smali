.class public Lr0/a;
.super Lr0/m;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 3

    invoke-direct {p0}, Lr0/m;-><init>()V

    const/4 v0, 0x1

    .line 1
    invoke-virtual {p0, v0}, Lr0/m;->J(I)Lr0/m;

    new-instance v1, Lr0/c;

    const/4 v2, 0x2

    invoke-direct {v1, v2}, Lr0/c;-><init>(I)V

    invoke-virtual {p0, v1}, Lr0/m;->H(Lr0/g;)Lr0/m;

    new-instance v1, Lr0/b;

    invoke-direct {v1}, Lr0/b;-><init>()V

    invoke-virtual {p0, v1}, Lr0/m;->H(Lr0/g;)Lr0/m;

    new-instance v1, Lr0/c;

    invoke-direct {v1, v0}, Lr0/c;-><init>(I)V

    invoke-virtual {p0, v1}, Lr0/m;->H(Lr0/g;)Lr0/m;

    return-void
.end method
